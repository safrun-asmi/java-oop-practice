package com.example;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class MyServiceVerifyTest {
    @Test
    public void testVerifyInteraction() {
        // Arrange: create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Act: call the service
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Assert: verify that getData() was called once
        verify(mockApi).getData();
    }
}
