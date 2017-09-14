package me.philippheuer.twitch4j.events.event.irc;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import me.philippheuer.twitch4j.events.event.AbstractChannelEvent;
import me.philippheuer.twitch4j.model.Channel;
import me.philippheuer.twitch4j.model.User;

/**
 * This event gets called when a user gets banned.
 *
 * @author Philipp Heuer [https://github.com/PhilippHeuer]
 * @version %I%, %G%
 * @since 1.0
 */
@Data
@Getter
@EqualsAndHashCode(callSuper = false)
public class UserBanEvent extends AbstractChannelEvent {

	/**
	 * Event Target User
	 */
	private final User user;

	/**
	 * Reason for Punishment
	 */
	private final String reason;

	/**
	 * Event Constructor
	 *
	 * @param channel The channel that this event originates from.
	 * @param user    The user who triggered the event.
	 * @param reason  Reason for Ban.
	 */
	public UserBanEvent(Channel channel, User user, String reason) {
		super(channel);
		this.user = user;
		this.reason = reason;
	}
}
