package FindDocswithOddPages;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan=new Scanner(System.in);
        Document[] docsArray=new Document[4];

        for(int i=0;i<4;i++){
            int id=scan.nextInt();
            String title=scan.next();
            String folderName=scan.next();
            int pages=scan.nextInt();
            docsArray[i]=new Document(id,title,folderName,pages);
        }
        Document[] result=docsWithOddPages(docsArray);

        if(result!=null){
            for(int i=0;i<result.length;i++){
                if(result[i].getTitle()!=null){
                    System.out.println(result[i].getId()+" "+result[i].getTitle()+" "+
                            result[i].getFolderName()+" "+result[i].getPages());
                }
            }
        }
    }
    public static Document[] docsWithOddPages(Document[] docsArray){
        Document[] oddDocs=new Document[0];

        for(int i=0;i<docsArray.length;i++){
            if(docsArray[i].getPages()%2!=0){
                oddDocs=Arrays.copyOf(oddDocs, oddDocs.length+1);
                oddDocs[oddDocs.length-1]=docsArray[i];
            }
        }
        for(int i=0;i<oddDocs.length;i++){
            for(int j=i+1;j<oddDocs.length;j++){
                if(oddDocs[i].getId()>oddDocs[j].getId()){
                    Document temp=oddDocs[i];
                    oddDocs[i]=oddDocs[j];
                    oddDocs[j]=temp;
                }
            }
        }
        return oddDocs.length>0?oddDocs:null;
    }
}
class Document{
    private int id;
    private String title;
    private String folderName;
    private int pages;

    Document(int id, String title, String folderName, int pages){
        this.id=id;
        this.title=title;
        this.folderName=folderName;
        this.pages=pages;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getFolderName(){
        return this.folderName;
    }
    public void setFolderName(String folderName){
        this.folderName=folderName;
    }
    public int getPages(){
        return this.pages;
    }
    public void setPages(int pages){
        this.pages=pages;
    }

}