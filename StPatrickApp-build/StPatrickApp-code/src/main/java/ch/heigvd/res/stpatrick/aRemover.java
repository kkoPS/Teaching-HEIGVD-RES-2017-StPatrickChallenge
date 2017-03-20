package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * processor to remove 'A' and 'a' lettres
 */
public class aRemover implements IStreamProcessor {

    @Override
    public void process(Reader in, Writer out) throws IOException
    {
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);
        int c = br.read();
        System.out.println(c);
        while (c != -1) {
            if (c != 65 && c != 97) // MAGIC NUMBERS (ascii for E and e
            {
                bw.write(c);
            }
            c = br.read();

        }
        bw.flush();
    }
}
