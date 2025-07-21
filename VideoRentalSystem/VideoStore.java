import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private List<Video> videos;

    public VideoStore() {
        videos = new ArrayList<>();
    }

    public void addVideo(String name) {
        videos.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        Video video = findVideoByName(name);
        if (video != null && !video.getCheckout()) {
            video.doCheckout();
            System.out.println("Video \"" + name + "\" checked out successfully.");
        } else {
            System.out.println("Video not found or already checked out.");
        }
    }

    public void doReturn(String name) {
        Video video = findVideoByName(name);
        if (video != null && video.getCheckout()) {
            video.doReturn();
            System.out.println("Video \"" + name + "\" returned successfully.");
        } else {
            System.out.println("Video not found or not checked out.");
        }
    }

    public void receiveRating(String name, int rating) {
        Video video = findVideoByName(name);
        if (video != null) {
            video.receiveRating(rating);
            System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void listInventory() {
        System.out.printf("\n%-20s %-15s %-10s\n", "Video Name", "Checked Out", "Rating");
        for (Video video : videos) {
            System.out.printf("%-20s %-15s %-10d\n", video.getName(), video.getCheckout(), video.getRating());
        }
    }

    private Video findVideoByName(String name) {
        for (Video video : videos) {
            if (video.getName().equalsIgnoreCase(name)) {
                return video;
            }
        }
        return null;
    }
}
