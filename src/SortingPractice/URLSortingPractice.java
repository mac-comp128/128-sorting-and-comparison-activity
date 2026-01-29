package SortingPractice;

import java.net.MalformedURLException;
import java.util.Arrays;

public class URLSortingPractice {
    private static URL[] urls;

    /**
     * initialize the urls array with sample urls.
     */
    private static void initURLs() throws MalformedURLException {
        urls = new URL[5];
        urls[0] = new URL("https://www.macalester.edu/mscs/");
        urls[2] = new URL("www.google.com");
        urls[1] = new URL("macalester.edu");
        urls[3] = new URL("https://drive.google.com");
        urls[4] = new URL("leetcode.com");
    }

    public static void main(String[] args) {
        try {
            initURLs();
        } catch (Exception e) {
            System.err.println("provided URLs are malformed.");
        }
        System.out.println("Initial Order:");
        Arrays.stream(urls).forEach(s -> System.out.println(s));

        // Sort using natural ordering (Comparable)
        Arrays.sort(urls);
        System.out.println("Natural Ordering:");
        Arrays.stream(urls).forEach(s -> System.out.println(s));

        // TODO: Sort in a way to keep the macalester and google domains adjacent.
    }
}
