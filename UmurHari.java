class UmurHari {
    public static void main (String[] args){
        System.out.println("Mari kita coba-coba");
        //this is for 1 line comment
        
        /*this slash and asterisk
        are used for multiple 
        lines comment*/
        
        /*Tokorode,
        // u can do this also
        */
        
        /**now this is for documentation comment*/
        /* 
        float z = (float)x / y;
        
        System.out.printf("%d / %d = %f \n", x,y,z);
        System.out.println("And then mari kita coba beri increment");

        int a = (int)z;
        System.out.printf("INCREMENTO NO JUTSU --> %d \n", a++);
        System.out.println("ehehehe jodandayo~");
        System.out.printf("Here's an output for u --> %d \n", a);
        System.out.printf("aaannnddd DECREMENTO NO JUTSU --> %d \n", --a);
        System.out.print(--a + "\n" + --a + "\n" + --a + "\n" + --a + "\n" + --a + "\n" + --a + "\n");
        System.out.println("BANG!"); */

        int jan = 0;
        int feb = 31;
        int mar = 59;
        int apr = 90;
        int mei = 120;
        int jun = 151;
        int jul = 181;
        int ags = 212;
        int sep = 243;
        int okt = 273;
        int nov = 304;
        int des = 334;


        int tglSkrg = 15;
        int blnSkrg = ags;
        int thnSkrg = 2021;

        int tglLahir = 4;
        int blnLahir = des;
        int thnLahir = 2000;

        //Hitungan umur per 365 hari
        
        int umurThn = thnSkrg - thnLahir;
        // System.out.printf("Jika umurmu sekarang adalah %d tahun.. \n", umurThn);

        int umurA = umurThn / 4;

        int umurHari = umurA * 1461;
        
        int mod = umurThn % 4;
        // System.out.printf("Dengan modulus = %d tahun \n", mod);
        int umurMod = mod * 365;

        int umurSmntr = umurHari + umurMod;
        // System.out.printf("Maka umurmu sampai ultah adalah %d hari \n", umurSmntr);
        
        //Hitungan umur ke hari ini

        int x = blnSkrg + tglSkrg;
        int y = blnLahir + tglLahir;
        int z = x - y;

        if(umurThn % 4 == 0 || thnLahir % 4 == 0 && blnLahir >= mar){
            int umurTotal = umurSmntr + z;
        System.out.printf("Uwahh kamu sudah hidup %d hari!~", umurTotal);
        }

        //yang sisa itu februarinya 29 
        else {
            int umurTotal = umurSmntr + z + 1;
        System.out.printf("Uwahh kamu sudah hidup %d hari!~", umurTotal);
        }


    }
}