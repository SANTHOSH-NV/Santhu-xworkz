class Browser
{
String name;
public static void main(String a[])
{
Browser browser = new Browser();
browser.name= "Firefox";
System.out.println(browser.name);
Browser browser1 = new Browser();
browser1.name= "Google Chrome";
System.out.println(browser1.name);
browser.browse();
}
void browse()
{
System.out.println("Browsing about Github");
}
}
