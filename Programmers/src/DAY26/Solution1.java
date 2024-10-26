package DAY26;

public class Solution1 {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String[] commands1 = { "next", "prev" };
		String[] commands2 = { "prev", "next", "next" };
		String[] commands3 = { "next" };
		System.out.println(sol.solution("34:33", "13:00", "00:55", "02:55", commands1));
		System.out.println(sol.solution("10:55", "00:05", "00:15", "06:55", commands2));
		System.out.println(sol.solution("07:22", "04:05", "00:15", "04:07", commands3));
	}
}

class Solution12 {
    private String secondsToTimeString(int seconds) {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d", minutes, secs);
    }

    private int timeStringToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = timeStringToSeconds(video_len);
        int position = timeStringToSeconds(pos);
        int openingStart = timeStringToSeconds(op_start);
        int openingEnd = timeStringToSeconds(op_end);

        for (String command : commands) {
        	if(position >= openingStart && position <= openingEnd) {
        		position=openingEnd;
        	}
            switch (command) {
                case "prev":
                    position = Math.max(0, position - 10);
                    break;

                case "next":
                    position = Math.min(videoLength, position + 10);
                    break;
            }

            if (position >= openingStart && position <= openingEnd) {
                position = openingEnd;
            }
        }

        return secondsToTimeString(position);
    }
}
