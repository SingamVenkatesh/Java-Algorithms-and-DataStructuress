package MediumLevelLeetcodePeoblemstop10;

public class LongestSubstringWIthoutreapeatingcharacters
{
        public static void main(String[] args) {
            String s = "pwwkew";
            int maxLength = 0;

            for (int i = 0; i < s.length(); i++) {
                boolean[] visited = new boolean[256]; // ASCII size

                for (int j = i; j < s.length(); j++)
                {
                    char ch=s.charAt(j);
                    if (visited[ch]) {
                        break;
                    } else {
                        visited[ch] = true;
                        maxLength = Math.max(maxLength, j - i + 1);
                    }
                }
            }

            System.out.println("Length of Longest Substring Without Repeating Characters: " + maxLength);
        }
    }
