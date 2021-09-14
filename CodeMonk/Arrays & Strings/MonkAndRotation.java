import java.util.*;
import java.util.stream.*;

class MonkAndRotation
{
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);

			int testCases = Integer.parseInt(scan.nextLine());

			for(int i=1; i<=testCases; i++)
			{
				int rotation = Integer.parseInt(scan.nextLine().split(" ")[1]);

				List<String> initList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

				System.out.println(rotateArray(initList , rotation > initList.size() ? rotation % initList.size() : rotation));
			}
			
			scan.close();
		}

		private static String rotateArray(List<String> initList , int rotation)
		{
			if(rotation > 0)
			{
				return Stream.concat(initList.subList(initList.size()-rotation,initList.size()).stream(),initList.subList(0,initList.size()-rotation).stream()).collect(Collectors.joining(" ", "" , ""));
			}

			return initList.stream().collect(Collectors.joining(" " , "" , ""));
		}
}
