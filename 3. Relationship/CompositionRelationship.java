import java.util.*;
class Book           //Outer class Book Definition
{
    int id;
    String name;
    Scanner sc;
    Page[] pages;    //inner class objects array

    //INNER CLASS DEFINITION
    class Page
    {
        int[] lines;   //array of lines to store number of word
        Page(int numLines)
        {
            lines=new int[numLines];
        }
        void setLines() //initialise the number of words info for every lines
        {
            for(int i=0; i<lines.length;i++)
            {
                System.out.println("Enter the number of words for line " + (i+1));
                lines[i] = sc.nextInt();
            }
        }
        int getLines()   //return number of lines
        {
            return lines.length;
        }
    } // END OF INNER CLASS DEFINITION
    //Outer class constructor
    Book(int id, String name,int numpages)
    {
        this.id = id;
        this.name= name;
        sc = new Scanner(System.in);
        pages = new Page[numpages];
        for(int i=0;i<pages.length;i++)
        {
            System.out.println("Enter Number of line for Pages"+(i+1));
            int nlines = sc.nextInt();
            pages[i] = new Page(nlines); // create inner class Page object
            pages[i].setLines();   //set the number of words per line
        }
    }
    // Perform statistics.. find total number of words in book
    public int getNumOfWords()
    {
        int numOfWords = 0;
        for(int i=0; i<pages.length;i++)  //loop for num of pages
        //loop for num of words per line
            for(int j=0;j<pages[i].getLines();j++)
            {
                numOfWords += pages[i].lines[j];
            }
        return numOfWords;


    }
}

class Bookstatistics
{
    public static void main(String args[])
    {
        Book b = new Book(1,"OOPM Book",3); // Create book with 3 pages
        int nowords=b.getNumOfWords();
        System.out.println("Total words = " + nowords);
    }
}