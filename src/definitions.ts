export interface GershadCapacitorPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
