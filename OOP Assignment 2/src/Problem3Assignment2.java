import java.util.Scanner;

public class Problem3Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set up array and topics
       String[] topic={"Music","Marvel","Disney","Nature","Snacks"};
       int[][] responses=new int[5][11];
       
       //set up counters
       for(int loop=0;loop<4;loop++)
       {
           for(int loopAgain=1;loopAgain<=10;loopAgain++)
           {
               responses[loop][loopAgain]=0;
           }
       }
       
       //gather the people
       int peoples;
       System.out.print("number of people are going to rate: ");
      
       //set up and scan
       Scanner sc=new Scanner(System.in);
       peoples=sc.nextInt();
       
       //get i ready
       int loop=1;
       
       //loop for all people rating
       while(loop<=peoples){
           
    	   for(int loopAgain=0;loopAgain<5;loopAgain++)
           {
    		   //ask about each topic
               System.out.print("please rate "+topic[loopAgain]+": ");
               int x=sc.nextInt();
               //loop all topics
               responses[loopAgain][x]=responses[loopAgain][x]+1;
           }
    	   //loop for all people
    	   System.out.print("\n\n");
           loop++;
       }
       
       //set up numbers so that rating is easy
       int max_p=-100,min_p=100,max_topic=0,min_topic=0;
       
       //compare all of the things
       for(loop=0;loop<5;loop++)
       {
           int total=0,count=0;
           
           for(int loopAgain=1;loopAgain<=10;loopAgain++)
           {
               total=total+loopAgain*responses[loop][loopAgain];
               count=count+responses[loop][loopAgain];
           }
           
           if(max_p<total)
           {  
               max_p=total;
               max_topic=loop;
           }
           
           if(min_p>total)
           {  
               min_p=total;
               min_topic=loop;
           }
           
           //print the totals
           System.out.println("topic: " +topic[loop]+", point total: "+total+", average: "+(total+0.0)/count);
       }
       
       //announce winner and loser
       System.out.println("\nWinning topic and score!");
       System.out.println(topic[max_topic]+" "+max_p);
       System.out.println("\nLosing topic and score :(");
       System.out.println(topic[min_topic]+" "+min_p);
   }
}