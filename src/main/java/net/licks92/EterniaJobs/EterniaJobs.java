package net.licks92.EterniaJobs;

import net.licks92.EterniaCore.Plugin.EterniaPlugin;

public class EterniaJobs extends EterniaPlugin
{
	@Override
	public void onEnable()
	{
		this.linkToCore(this.getName());
	}
	
	@Override
	public void onDisable()
	{
		
	}
}
