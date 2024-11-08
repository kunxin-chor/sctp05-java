package M17_Library_Interface;

public class CD extends LendingMaterial {
    private String mediaType; // DVD, CD or Blue-ray
    private String dataType; // video, audio, data

    public CD() {
        super();
        mediaType = "Unknown";
        dataType = "Unknown";
    }

    public CD(String title, int yearPublished, double cost, 
    boolean isReference, String mediaType, String dataType) {
        super(title, yearPublished, cost, isReference);
        this.mediaType = mediaType;
        this.dataType = dataType;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        if (dataType.equals( "data") || dataType.equals("video") || dataType.equals("audio")) {
            this.dataType = dataType;
        }
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        if (mediaType.equals("cd-rom") || mediaType.equals("dvd") || mediaType.equals("blue-ray")) {
            this.mediaType =  mediaType;
        }
    }


}
