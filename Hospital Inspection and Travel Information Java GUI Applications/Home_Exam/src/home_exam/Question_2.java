package home_exam;
//--------------------------------------------------------Question2-----------------------------------------------------------------//
 public class Question_2
{
//----------------------------------------------------------------PropertyPrices()---------------------------------------------------//
    public void propertyPrices()
    {
        //here I declare the prices in 2d array//
        int[][] Prices =
        {
            {
                800000, 1500000, 2000000
            },
            {
                700000, 1200000, 1600000
            },
            {
                750000, 1300000, 1800000
            }
        };
        
        //I link the method here for displaying and averaging//
        displayProperty(Prices);

    }
    //----------------------------------------------------------------End of PropertyPrices()---------------------------------------------------//

    
    //-----------------------------------------------------------------DisplayProperty------------------------------------------------------//
    public void displayProperty(int[][] pr)
    {
        //Here I declare the headings
        System.out.printf("%19s\t\t\t%s\t\t%s", "FLAT", "TOWN HOUSE", "HOUSE\n");
        System.out.println("-----------------------------------------------------------------------------");
        
        
        double avg = 0.0;
        double sum;
        //I have declare the Places here
        String [] place = {"Gauteng","Natal","Cape"};
        
//            System.out.printf("%s%s%s",place[0],place[1],place[2]);
        for (int pla = 0; pla < pr.length; pla++)
        {  
            System.out.printf("%s",place[pla]);
            //Here Iam displaying the property prices and getting the avg values of a property//
            sum = 0.0;
            for (int pri = 0; pri < pr[pla].length; pri++)
            {
                System.out.printf("\t\t R%d",pr[pla][pri]);
                sum += pr[pla][pri];
                //Here iam adding up the values of prices to divide the length to get average values//
                avg = sum / pr[pri].length;
                
            }
            
            System.out.println();
                
        }
        //here iam displaying the values here//
            System.out.printf("\nAverage Property prices in Gauteng: R %.0f", avg);
            System.out.printf("\nAverage Property prices in Natal: R %.0f", avg);
            System.out.printf("\nAverage Property prices in Cape: R %.0f", avg);
            System.out.println();

 //-----------------------------------------------------------------End of DisplayProperty------------------------------------------------------//
    }
    
    //-----------------------------------------------------------------End of Class------------------------------------------------------------------//

}
