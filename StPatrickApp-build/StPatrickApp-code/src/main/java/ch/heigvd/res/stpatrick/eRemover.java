package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * processor to remove 'E' and 'e' lettres
 */
public class eRemover implements IStreamProcessor {

    @Override
    public void process(Reader in, Writer out) throws IOException
    {
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);
        int c = br.read();
        System.out.println(c);
        while (c != -1) {
            if (c != 69 && c != 101) // MAGIC NUMBERS (ascii for E and e
            {
                bw.write(c);
            }
            c = br.read();

        }
        bw.flush();
    }
}
