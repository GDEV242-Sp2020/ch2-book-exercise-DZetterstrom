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
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookCourseText;
    }

    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public void printAuthor(){
        System.out.println(author);
    }
    
    public void printTitle(){
        System.out.println(title);
    }
    
    public void printDetails(){
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Number of Pages: " + pages);
        if(refNumber.length() != 0){
            System.out.println("Reference Number: " + refNumber);
        }else{
            System.out.println("ZZZ");
        }
        System.out.println("Borrwed " + borrowed + " times");
    }
    
    public void setRefNumber(String ref){
        if(ref.length() >= 3){
            refNumber = ref;
        }else{
            System.out.println("ERROR: Reference number does not meet length requirement");
        }
    }
    
    public String getRefNumber(){
        return refNumber;
    }
    
    public void borrow(){
        borrowed++;
    }
    
    public int getBorrowed(){
        return borrowed;
    }
    
    public boolean isCourseText(){
        return courseText;
    }
}
