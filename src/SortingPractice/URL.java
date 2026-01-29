package SortingPractice;
import java.util.regex.Pattern;
import java.net.MalformedURLException;
import java.util.regex.Matcher;

/**
 * Represents simple urls of the form [SCHEME]://[SUBDOMAIN].[DOMAIN].[TLD]/[Path]
 */
public class URL implements Comparable<URL> {
    String scheme, subdomain, domain, tld, path;
    String urlRegex = "((?<scheme>\\S+):\\/\\/)?((?<subdomain>\\S*)\\.)?(?<domain>\\S+)\\.(?<tld>[^\\s\\/]+)((?<path>\\/\\S*))?";

    /**
     * Creates a URL object from a URL string. 
     * @Param url a string representation of a url. 
     */
    public URL(String url) throws MalformedURLException{
        Pattern urlPattern = Pattern.compile(urlRegex);
        Matcher urlMatch = urlPattern.matcher(url);

        if (!urlMatch.matches()) throw new MalformedURLException();

        scheme = urlMatch.group("scheme");
        subdomain = urlMatch.group("subdomain");
        domain = urlMatch.group("domain");
        tld = urlMatch.group("tld");
        path = urlMatch.group("path");
    }

    /**
     * Get the URL's scheme (i.e., http or https)
     * @Return the URL's scheme
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * Get the URL's subdomain (ie. www)
     * @Return the URL's subdomain
     */
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * Get the URL's domain (ie. google or macalester)
     * @Return the URL's domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Get the URL's top-level domain (i.e., com or edu)
     * @Return the URL's domain
     */
    public String getTLD() {
        return tld;
    }

    /**
     * Get the URL's path (ie. /mscs/courses)
     * @Return the URL's path
     */
    public String getPath() {
        return path;
    }

    /**
     * Return a string representation of the url (http://www.macalester.edu/mscs/courses/)
     * @Return the URL's path
     */
    public String toString() {
        StringBuilder out = new StringBuilder();
        if (getScheme() != null) {
            out.append(getScheme())
                .append("://");
        }
        if (getSubdomain() != null) {
            out.append(getSubdomain())
                .append(".");
        }
        out.append(getDomain())
            .append(".")
            .append(getTLD());
        if (getPath() != null) {
            out.append(getPath());
        }
        return out.toString();
    }

    /**
     * Test for equality of the underlying URL
     * We distinguish between urls that resolve to the same website, but omit
     * some part of the URL format.
     * @Return True if the URL's are equal
     */
    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if ((other != null) && (other instanceof URL)) {
            URL oURL = (URL) other;
            result = (getScheme() == oURL.getScheme()) &&
                     (getSubdomain() == oURL.getSubdomain()) &&
                     (getDomain() == oURL.getDomain()) &&
                     (getTLD() == oURL.getTLD()) &&
                     (getPath() == oURL.getPath());
        }
        return result;
    }

    /**
     * Compare two URLs to each other alphabetically based on their string 
     * representation.
     * @Param other the URL to compare to
     * @Return -1 if the other URL should come after, 1 if it should come 
     * before, or 0 if they are equal.
     */
    public int compareTo(URL other) {
        return toString().compareTo(other.toString());
    }
}
