class Movies1
{
public static void main(String a[])
{
String movieNames[]={"KGF","SAHOO","BAHUBALI","A","RRR"};
getmovies(movieNames);
}
public static String[] getmovies(String[] movies)
{
String[] moviesNames = null;
for(int i=0;i<movies.length;i++)
{
moviesNames=movies;
System.out.println(moviesNames[i]);
}
return moviesNames;
}
}
