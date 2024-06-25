package dummy;

import org.apache.commons.lang3.StringUtils;

public final class DummyImpl implements Dummy {

    public DummyImpl() {
        // make use of library
        System.out.println(StringUtils.repeat('!', 3));
    }
}
