/*
write code for multi sort on multiple field in version like 30.20.1, 30.20.3 in java code without using comparable or comparator or stream api
  */

public class MultiFieldVersionSort {
    public static void main(String[] args) {
        String[] versions = {
            "30.20.1",
            "30.20.3",
            "30.19.9",
            "30.20.10",
            "29.1.0",
            "30.20.2"
        };

        bubbleSort(versions);

        for (String version : versions) {
            System.out.println(version);
        }
    }

    public static void bubbleSort(String[] versions) {
        int n = versions.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (compareVersions(versions[j], versions[j + 1]) > 0) {
                    // Swap versions[j] and versions[j + 1]
                    String temp = versions[j];
                    versions[j] = versions[j + 1];
                    versions[j + 1] = temp;
                }
            }
        }
    }

    public static int compareVersions(String version1, String version2) {
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");

        int length = Math.max(parts1.length, parts2.length);
        for (int i = 0; i < length; i++) {
            int num1 = (i < parts1.length) ? Integer.parseInt(parts1[i]) : 0;
            int num2 = (i < parts2.length) ? Integer.parseInt(parts2[i]) : 0;

            if (num1 < num2) {
                return -1; // version1 is less than version2
            } else if (num1 > num2) {
                return 1; // version1 is greater than version2
            }
            // If equal, continue to the next part
        }
        return 0; // versions are equal
    }
}
