public class Arrays {

    public static void main (String[] args) {

        System.out.println("test test");

        String[] dogs = new String[] {"corgi", "bichon frise", "poodle", "St Bernard", "pit bull"};
         for (String canine : dogs) {
          System.out.println("I have a " + canine +".");

         }

         double[] ages = new double[] {34, 33, 30, 36, 26};
         for (double yearsOld : ages) {
         yearsOld = yearsOld + 5;
             System.out.println ("Age in 5 years is: " + yearsOld + ".");

             System.out.println("And in another year, the age will be " + (yearsOld+1) + ".");

         }
         double sum = 0;
         for (double edad : ages ) {
            sum += edad;
           // System.out.println(sum);
         }

       // sum = ages[0] + ages[1] + ages[2] + ages[3] + ages[4];
        System.out.println(sum);

        System.out.println(java.util.Arrays.toString(dogs));

    }
}
