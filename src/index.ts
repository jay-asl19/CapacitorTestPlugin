import { registerPlugin } from '@capacitor/core';

import type { GershadCapacitorPluginPlugin } from './definitions';

const GershadCapacitorPlugin = registerPlugin<GershadCapacitorPluginPlugin>(
  'GershadCapacitorPlugin',
  {
    web: () => import('./web').then(m => new m.GershadCapacitorPluginWeb()),
  },
);

export * from './definitions';
export { GershadCapacitorPlugin };
