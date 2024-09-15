package tech.buildrun.springsecurity.controller.dto;

import java.time.Instant;

public record FeedItemDto(long tweetId, String content, String username, Instant creationTimestamp) {
}
