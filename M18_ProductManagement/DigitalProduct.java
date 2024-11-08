package M18_ProductManagement;

import java.util.Scanner;

public class DigitalProduct extends Product {
    private String format; // mp3, mp4, mov, pdf, pub etc.
    private String downloadLink;
    private int fileSize; // in bytes

    public DigitalProduct() {
        super();
        format = "N/A";
        downloadLink = "N/A";
        fileSize = 0;
    }

    public DigitalProduct(String sku, String name, double price, String format, String downloadLink, int fileSize) {
        super(sku, name, price);
        this.format = format;
        this.downloadLink = downloadLink;
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File format: " + format);
        System.out.println("Download link: " + downloadLink);
        System.out.println("File Size: " + fileSize);
    }

    @Override
    public void edit(Scanner sc) {
        System.out.println("Enter new format format or press ENTER to skip");
        String fileFormat = sc.nextLine();
        setFormat(fileFormat.length() > 0 ? fileFormat : this.format);

        System.out.println("Enter the new download link or press ENTER to skip");
        String downloadLink = sc.nextLine();
        setDownloadLink(downloadLink.length() > 0 ? downloadLink : this.downloadLink);

        System.out.println("Enter the new download size or press ENTER to skip");
        String fileSize = sc.nextLine();
        if (fileSize.length() > 0 ) {
            setFileSize(Integer.parseInt(fileSize));
        }
    }

    @Override
    public double calculateSalesTax() {
        return 0;
    }

    
    
}
