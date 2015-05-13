import java.util.Scanner;
public class FP {
    public static void InsertionSort(int[] num)
{
    int j; 
    int key;
    int i;  
    String[] hasil = new String[num.length];
    String[] hasil2 = new String[num.length];
    for (j=1;j<num.length;j++)
    {   key = num[j];
        for(i=j-1;(i>= 0)&&(num[i]>key);i--)
        {   num[i+1] = num[i];
        }
        num[i+1] = key;}
    for(int k=0;k<num.length;k++){
        hasil[k] = Integer.toString(num[k]);
        hasil2[k] = hasil[k];
            if(hasil[k].equals("1")){
                hasil2[k]= hasil[k].replace("1","as");
            }
            if(hasil[k].equals("11")){
                hasil2[k]= hasil[k].replace("11","jack");
            }
            if(hasil[k].equals("12")){
                hasil2[k]= hasil[k].replace("12","queen");
            }
            if(hasil[k].equals("13")){
                hasil2[k]= hasil[k].replace("13","king");
            }
            System.out.print(hasil2[k]+" ");
    }
    
    
}
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan jumlah kartu : ");
        int n = masuk.nextInt();
        String[] data = new String[n];
        String[] data1 = new String[n];
        int[] jadi = new int[n];
        for(int i = 0 ; i < n ; i++){
                do{
                    System.out.print("Masukkan kartu ke-"+(i+1)+" : ");
                    data[i] = masuk.next();} 
                    while(!"as".equals(data[i])&
                        !"jack".equals(data[i])&
                        !"queen".equals(data[i])&
                        !"king".equals(data[i])&
                        !"2".equals(data[i])&
                        !"3".equals(data[i])&
                        !"4".equals(data[i])&
                        !"5".equals(data[i])&
                        !"6".equals(data[i])&
                        !"7".equals(data[i])&
                        !"8".equals(data[i])&
                        !"9".equals(data[i])&
                        !"10".equals(data[i]));          
            data1[i] = data[i];
            if(data[i].equals("as")){
                data1[i] = data[i].replace("as","1");
            }
            if(data[i].equals("jack")){
                data1[i] = data[i].replace("jack","11");
            }
            if(data[i].equals("queen")){
                data1[i] = data[i].replace("queen","12");
            }
            if(data[i].equals("king")){
                data1[i] = data[i].replace("king","13");
            }
            jadi[i] = Integer.parseInt(data1[i]);
        }
        InsertionSort(jadi);
    
    }
    
}
