import com.google.inject.AbstractModule;
import com.google.inject.Module;

public class DiscountGuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Discountable.class).to(EarlyBirdDiscount.class);
    }
}
