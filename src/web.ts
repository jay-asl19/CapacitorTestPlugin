import { WebPlugin } from '@capacitor/core';

import type { GershadCapacitorPluginPlugin } from './definitions';

export class GershadCapacitorPluginWeb
  extends WebPlugin
  implements GershadCapacitorPluginPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
