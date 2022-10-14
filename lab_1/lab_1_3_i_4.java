/**
 * lab_1_3_i_4
 */
public class lab_1_3_i_4 {
    public static void main(String[] args) {

        int liczby[] = new int [15];

		liczby[0] = 0;
		liczby[1] = 1;
		liczby[2] = 2;
		liczby[3] = 3;
		liczby[4] = 4;
		liczby[5] = 5;
		liczby[6] = 6;
		liczby[7] = 7;
		liczby[8] = 8;
		liczby[9] = 9;
		liczby[10] = 10;
		liczby[11] = 11;
		liczby[12] = 12;
		liczby[13] = 13;
		liczby[14] = 14;
		
		int liczby2[] = new int [15];
		
		for (int i=0; i < 15; i++)
		{
			liczby2[i]=i;
		    System.out.println(liczby2[i]);
		}

		int i=0;
		while (i<10) {
			if (liczby[i]%3==0) {
				System.out.println("licba "+liczby[i]+"podzielna prze 3");
			}
			i++;
		}
	}
}
