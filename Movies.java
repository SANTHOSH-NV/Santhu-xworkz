class Movies
{
static String movieNames[]={"KGF","SAHOO","BAHUBALI","A"};
public static void main(String a[])
{
String[] movies = getmovies(movieNames);
for(int i=0;i<movies.length;i++)
{
System.out.println(movies[i]);
}
}
public static String[] getmovies(String[] movies)
{
return movies;
}
}