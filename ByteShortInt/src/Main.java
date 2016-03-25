import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by edvinj on 3/11/16.
 */
public class Main {

    public static void main(String[] args) {

        // int has a widht of 32
        int i = 12345;

        // byte has width of 8
        byte b = -10;



        // byte has width of 16
        short s = 32767;

        //long has a width of 64
        long myLongValue = (long) (i + b + s);


        System.out.println(myLongValue);
    }
}
