import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the size for array1");
int size = input.nextInt();

int[] arr1 = new int[size];

int i = 0;
while(i<arr1.length){
System.out.println("array at" + (i+1) + ": ");
arr1[i] = input.nextInt();
i++;
}

System.out.println("Enter the size for array2");
int size2 = input.nextInt();

int[] arr2 = new int[size2];

i = 0;
while(i<arr2.length){
System.out.println("array at" + (i+1) + ": ");
arr2[i] = input.nextInt();
i++;
}

int[] merge = merge(arr1,arr2);
System.out.println("Your Merged array is: ");

//display merge sorted array;
i = 0;
while(i<merge.length){
    System.out.println(merge[i]);
    i++;
}
}

public static int[] merge(int arr1[] , int arr2[]){
int newsize = arr1.length+arr2.length;
int newarr[] = new int[newsize];

int i=0; int j =0; int k =0;
while(i<arr1.length || j<arr2.length){
if(j==arr2.length || (i<arr1.length && arr1[i]<arr2[j])){
newarr[k] = arr1[i];
i++;
k++;
}
else{
newarr[k]=arr2[j];
k++;
j++;
}
}
return newarr;
 }





}
