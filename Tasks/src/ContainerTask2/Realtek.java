package ContainerTask2;

import com.sun.istack.internal.NotNull;

import Utils.Validator;

class Realtek implements AnswersTo {

    private final String mProductType;

    Realtek(@NotNull final String productType) {
        Validator.isArgNotNull(productType, "productType");
        Validator.isArgNotNull(productType, "productType");
        mProductType = productType;
    }

    @Override
    public boolean answersTo(@NotNull final String req) {
        Validator.isArgNotNull(req, "req");
        return req.equalsIgnoreCase(mProductType);
    }
}
