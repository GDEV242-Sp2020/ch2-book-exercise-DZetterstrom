/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    //Satisfies 2.85
    private int pages;
    //Satisifies 2.88
    private String refNumber;
    //Satisifies 2.91
    private int borrowed;
    //Satisifies 2.92
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        //Satisfies 2.85
        pages = bookPages;
        //Satisfies 2.88
        refNumber = "";
        courseText = bookCourseText;
    }
    //Satisfies 2.83
    public String getAuthor(){
        return author;
    }
    //Satisfies 2.83
    public String getTitle(){
        return title;
    }
    //Satisfies 2.85
    public int getPages(){
        return pages;
    }
    //Satisfies 2.84
    public void printAuthor(){
        System.out.println(author);
    }
    //Satisfies 2.84
    public void printTitle(){
        System.out.println(title);
    }
    //Satisfies 2.87
    public void printDetails(){
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Number of Pages: " + pages);
        //Satisfies 2.89
        if(refNumber.length() != 0){
            System.out.println("Reference Number: " + refNumber);
        }else{
            System.out.println("ZZZ");
        }
        System.out.println("Borrwed " + borrowed + " times");
    }
    //Satisifies 2.88
    public void setRefNumber(String ref){
        if(ref.length() >= 3){
            refNumber = ref;
        }else{
            System.out.println("ERROR: Reference number does not meet length requirement");
        }
    }
    //Satisfies 2.88
    public String getRefNumber(){
        return refNumber;
    }
    //Satisifies 2.91
    public void borrow(){
        borrowed++;
    }
    //Satisifies 2.91
    public int getBorrowed(){
        return borrowed;
    }
    //Satisifies 2.92
    public boolean isCourseText(){
        return courseText;
    }
}
