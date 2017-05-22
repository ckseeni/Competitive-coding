public class Codec {
    ArrayList<String> arr = new ArrayList<String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        arr.add(longUrl);
        return "http://tinyurl.com/"+(arr.size()-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String[] s = shortUrl.split("/");
        int i = Integer.parseInt(s[s.length-1]);
        return arr.get(i);
    }
}

TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.

Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
