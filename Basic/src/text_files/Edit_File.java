package text_files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Edit_File {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\Kavishka\\Desktop\\Read_Text_File.txt");

     //   String x = FileUtils.readFileToString(file, "UTF-8");
        FileUtils.write(file,"Learnong java","UTF-8",false);
       // System.out.println(x);

      //  List<String> list = FileUtils.readLines(file, "UTF-8");

       // System.out.println(list);

    }
}
