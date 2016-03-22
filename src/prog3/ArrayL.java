package prog3;

public class ArrayL {
	/*private int[] ar;

	public ArrayL(int i){
		ar= new int[i];
	}*/
	public static int[] sort(int[] arre){
		if (arre.length==1){
			return arre;
			}
		else{
			int[] arr1=mid1(arre);
			int[] arr2=mid2(arre);
			return merge(sort(arr1),sort(arr2));
		}
	}
	private static int[] mid1(int[] arre){
		int i=(arre.length/2)-1;
		int[] aux= new int[i+1];
		for (int j=0;j<=i;j++){
			aux[j]=arre[j];
			}
		return aux;

	}
	private static int[] mid2(int[] arre){
		int i=(arre.length/2);
		int[] aux= new int[i];
		for (int j=0;j<arre.length-1;j++){
			aux[j]=arre[i];
			i++;
			}
		return aux;
	}
	private static int[] merge(int[] arr1, int[] arr2){
		int[] aux=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while ((arr1.length>i)&&(arr2.length>j)){

			if (arr1[i]<arr2[j]){
				aux[k]=arr1[i];
				i++;
				k++;
			}else{
				aux[k]=arr2[j];
				j++;
				k++;
			}
		}
		while (arr1.length>i){
			aux[k]=arr1[i];
			i++;
			k++;
		}
		while (arr2.length>j){
			aux[k]=arr2[j];
			j++;
			k++;
		}
		return aux;
	}

}
