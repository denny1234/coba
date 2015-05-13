package tugasbp;
public class Jaccard{
    static int jaccardSimilarity(int[] vektor1,int[] vektor2){
        int intersection = 0,jumlah = 0;
        
	for(int i=0;i<vektor1.length;i++)
        {   if (vektor1[i] == 1 && vektor2[i] == 1) 
        {   intersection = intersection+1;
        }
	} 
	for(int j=0;j<vektor1.length;j++)
        {   if ((vektor1[j] == 0 && vektor2[j] == 1)||(vektor1[j] == 1 & vektor2[j] == 0)) 
        {   jumlah = jumlah+1;
        }
        }
        int persen = (intersection*100)/(jumlah+intersection);
	return persen;
    }    

    public static void main(String[] args) {
        
        int[] bambang 	= {1,0,0,0,1,1};
        int[] cahyono 	= {0,1,0,1,1,0};
	int[] dedi	= {1,1,0,0,1,1};
	int[] eko 	= {0,0,1,0,0,0};

        Jaccard contoh = new Jaccard();
        	
	System.out.printf("Jaccard Index Bambang dan Cahyono = %d persen \n",contoh.jaccardSimilarity(bambang,cahyono));
        System.out.printf("Jaccard Index Bambang dan Dedi = %d persen \n",contoh.jaccardSimilarity(bambang,dedi));
        System.out.printf("Jaccard Index Bambang dan Eko = %d persen \n",contoh.jaccardSimilarity(bambang,eko));
        System.out.printf("Jaccard Index Cahyono dan Dedi = %d persen \n",contoh.jaccardSimilarity(cahyono,dedi));
        System.out.printf("Jaccard Index Cahyono dan Eko = %d persen \n",contoh.jaccardSimilarity(cahyono,eko));
        System.out.printf("Jaccard Index Dedi dan Eko = %d persen \n",contoh.jaccardSimilarity(dedi,eko));
    }
}