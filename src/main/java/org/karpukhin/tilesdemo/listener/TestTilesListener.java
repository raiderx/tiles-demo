package org.karpukhin.tilesdemo.listener;

import org.apache.tiles.TilesApplicationContext;
import org.apache.tiles.factory.AbstractTilesContainerFactory;
import org.apache.tiles.startup.AbstractTilesInitializer;
import org.apache.tiles.startup.TilesInitializer;
import org.apache.tiles.web.startup.AbstractTilesListener;
import org.karpukhin.tilesdemo.support.TestTilesContainerFactory;

/**
 * @author Pavel Karpukhin
 */
public class TestTilesListener extends AbstractTilesListener {

    @Override
    protected TilesInitializer createTilesInitializer() {
        return new TestTilesListenerInitializer();
    }

    private static class TestTilesListenerInitializer extends AbstractTilesInitializer {

        @Override
        protected AbstractTilesContainerFactory createContainerFactory(
                TilesApplicationContext context) {
            return new TestTilesContainerFactory();
        }
    }
}
