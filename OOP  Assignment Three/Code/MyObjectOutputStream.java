import java.io.ObjectInputStream;

import java.io.*;

class MyObjectOutputStream extends ObjectOutputStream{

    // Default Constructor
    public MyObjectOutputStream() throws IOException{
        super();
    }

    // Argumented Constructor
    public MyObjectOutputStream(OutputStream o) throws IOException{
        super(o);
    }

    // Header so that it doesn't ruin the code
    public void writeStreamHeader(){
        // it doesn't write header
    }
}