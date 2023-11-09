package src;

public class ByteConverter {
    public static void main(String[] args) {
        int bytes = 2048;

        int kilobytes = toKilobytes(bytes);
        System.out.println(bytes + " bytes is equal to " + kilobytes + " kilobytes.");

        int convertedBytes = toBytes(kilobytes);
        System.out.println(kilobytes + " kilobytes is equal to " + convertedBytes + " bytes.");
    }

    public static int toKilobytes(int bytes) {
        return bytes / 1024;
    }

    public static int toBytes(int kilobytes) {
        return kilobytes * 1024;
    }
}