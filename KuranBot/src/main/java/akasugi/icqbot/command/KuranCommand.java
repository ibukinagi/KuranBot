package akasugi.icqbot.command;

import cc.moecraft.icq.event.events.message.EventGroupMessage;

public class KuranCommand extends AbstractCommand{
	
	private String prefix="/会战";
	
	@Override
	public String getPrefix() {
		return prefix;
	}

	@Override
	public void receiveGroupCommand(String command, EventGroupMessage event) {
		event.getHttpApi().sendGroupMsg(event.getGroupId(), command);
		
	}


}