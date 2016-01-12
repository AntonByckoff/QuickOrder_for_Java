// Быстрая рекурсивная сортировка

package quickorder;
class MyClass{
    MyClass(){
     int[] mas=new int[]{2,3,55,9,6,7,4,1,2,7,99,0,67,84,5};
     System.out.println(" Исходный массив :");
     show(mas);
     QOrd(mas,0,mas.length);
     System.out.println(" Отсортированный массив :");
     show(mas);
    }
 void QOrd(int[] mas,int a, int n){
     // переменная показывающая место барьерного эл-та:
     int k;
     // переменная используемая для перестановки эл-тов:
     int p;
     // определение положения барьерного эл-та
     if (n-a>1){
     k=(n-a)/2+a;
     } else {k=n;}
     // переменная указывающая на то, что сравниваемый эл-т
     // находится слева от барьерного
     boolean perest=false; 
     for (int i=a;i<n;i++){
       if (i!=k){  
         if (perest==false&i>k){perest=true;} 
         if (perest==false){
         //если значение текущего элемента больше знач барьерного
         // то переставляем их
         if(mas[i]>mas[k]){  
           p=mas[i];
           mas[i]=mas[k];
           mas[k]=p;
           k=i;
         perest=true;  
        }
        }
        else {
          if (mas[i]<=mas[k]){
           p=mas[i];
           for (int j=i; k<j; j--){
             // сдвиг в право
               mas[j]=mas[j-1];
           }
           mas[k]=p;
           // присваем новое положение барьерного эл-та
           k++;
          }   
         } 
       
     }
    } 
   
 if (k-a>2&a>0){
        QOrd(mas,a,k);
    } 
 
 if (k-a>1&a==0){
        QOrd(mas,a,k);
    }
 
   if (n-k>1){
        QOrd(mas,k,n);
    } 
    
 }
 void show(int[] mas){
   for (int i=0; i<mas.length; i++){
       System.out.print(mas[i]+" ");
   }  
    System.out.println();
 }
}
public class QuickOrder {
    public static void main(String[] args) {
        new MyClass();
    }
    
}
