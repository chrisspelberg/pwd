package pwd;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PwdApplication extends Application<PwdConfiguration> {

    @Override
    public String getName() {
        return "PlanWorkDeliver";
    }

    @Override
    public void initialize(Bootstrap<PwdConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle());
    }

    @Override
    public void run(PwdConfiguration configuration, Environment environment) throws Exception {
        // nothing to do yet
    }

    public static void main(String[] args) throws Exception {
        new PwdApplication().run(args);
    }
}
