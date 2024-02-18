
/*
 * Efficient Song Search: Implementing Binary Search in a Java Playlist
 * Application.
 * As part of your Java programming work on a music playlist application, you're
 * aiming to integrate a search feature
 * that enables users to swiftly locate songs within a sorted array of song
 * titles. The array's organization is based on
 * alphabetical order, prompting you to opt for the binary search algorithm to
 * facilitate the efficient retrieval of song
 * positions.
 * Your objective encompasses the implementation of the binary search algorithm,
 * tailored to identify the index of a
 * particular song within the sorted array. In cases where the song is located,
 * the function should return its index;
 * conversely, a return value of -1 would signify that the sought-after song is
 * absent from the playlist.
 */
import java.util.Arrays;

public class playlisthmrwk {
    public static void main(String[] args) {
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
