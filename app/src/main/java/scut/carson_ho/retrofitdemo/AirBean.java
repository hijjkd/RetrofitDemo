package scut.carson_ho.retrofitdemo;

public class AirBean {
    private String name;
    private String stargazers_count;
    private owner owner;

    private static class owner {
        private String avatar_url;

    }










    public void show() {
        System.out.println(name);
        System.out.println(stargazers_count);
        System.out.println(owner.avatar_url);

    }

}
