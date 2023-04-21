package murmurhash.example;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import java.nio.charset.Charset;

public class SimpleExample {

    public static void main(String[] args) {
        String input = "hebert freitas";
        byte[] inputBytes = input.getBytes(Charset.forName("UTF8"));
        HashCode hashCode = Hashing.murmur3_128().hashBytes(inputBytes);
        byte[] outputBytes = hashCode.asBytes();
    }
}
