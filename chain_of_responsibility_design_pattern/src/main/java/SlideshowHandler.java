public class SlideshowHandler extends DocumentHandler{


    public SlideshowHandler(DocumentHandler handler) {
        super(handler);
    }


    public void openDocument(String fileExtension){

        if (fileExtension.equals("ppt")){
            System.out.println("Opening Slideshow Document....");
        } else {
            super.openDocument(fileExtension);
        }

    }

}
