class FileReader {
    private String filename;

    public FileReader(String filename) {
        this.filename = filename;
    }

    public String read() throws FileNotFoundException, IOException {
        StringBuilder data = new StringBuilder();
        try (FileReader reader = new FileReader(filename)) {
            int character;
            while ((character = reader.read()) != -1) {
                data.append((char) character);
            }
        }
        return data.toString();
    }
}

class FileReaderApp {
    public static void main(String[] args) {
        String filename = "my_data.txt"; // Replace with your desired filename
        try {
            System.out.println("Reading data from file...");
            FileReader reader = new FileReader(filename);
            String data = reader.read();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please make sure the file '" + filename + "' exists and try again.");
        } catch (IOException e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
