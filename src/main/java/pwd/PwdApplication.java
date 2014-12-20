package pwd;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import pwd.user.UserResource;

public class PwdApplication extends Application<PwdConfiguration> {

    @Override
    public String getName() {
        return "PlanWorkDeliver";
    }

    @Override
    public void initialize(Bootstrap<PwdConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/assets", "/", "index.html", "pwd"));
    }

    @Override
    public void run(PwdConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().setUrlPattern("/api/*");
        environment.jersey().register(UserResource.class);
    }

    public static void main(String[] args) throws Exception {
        new PwdApplication().run(args);
    }
}
