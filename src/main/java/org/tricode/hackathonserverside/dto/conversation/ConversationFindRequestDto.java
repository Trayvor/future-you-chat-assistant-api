package org.tricode.hackathonserverside.dto.conversation;

import jakarta.validation.constraints.NotBlank;

public record ConversationFindRequestDto(@NotBlank String title) {
}
