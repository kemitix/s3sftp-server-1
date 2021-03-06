package com.hubio.s3sftp.server;

import lombok.val;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class S3SftpServerStartExceptionTest implements WithAssertions {

    @Test
    void shouldCreateException() {
        //given
        val cause = mock(Throwable.class);
        val message = "message";
        //when
        final S3SftpServerStartException exception = new S3SftpServerStartException(message, cause);
        //then
        assertThat(exception.getMessage()).isSameAs(message);
        assertThat(exception.getCause()).isSameAs(cause);
    }
}
